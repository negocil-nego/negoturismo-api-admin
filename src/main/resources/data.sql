-- ============================================================
-- Full-Text Search com PostgreSQL tsvector
-- Adiciona search_vector como coluna gerada (STORED) em todas
-- as tabelas, com pesos por campo e indice GIN para busca.
-- ============================================================

-- ─── TB_CATEGORIES ──────────────────────────────────────────
ALTER TABLE TB_CATEGORIES
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("category_group", '')), 'C')
    ) STORED;
CREATE INDEX IF NOT EXISTS category_search_vector_idx ON TB_CATEGORIES USING GIN (search_vector);

-- ─── TB_PERMISSIONS ─────────────────────────────────────────
ALTER TABLE TB_PERMISSIONS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("code", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("name", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'C')
    ) STORED;

CREATE INDEX IF NOT EXISTS permission_search_vector_idx ON TB_PERMISSIONS USING GIN (search_vector);

-- ─── TB_ROLES ───────────────────────────────────────────────
ALTER TABLE TB_ROLES
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("code", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("name", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'C')
    ) STORED;

CREATE INDEX IF NOT EXISTS role_search_vector_idx ON TB_ROLES USING GIN (search_vector);

-- ─── TB_USERS ───────────────────────────────────────────────
ALTER TABLE TB_USERS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("username", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("phone", '')), 'C') ||
    setweight(to_tsvector('portuguese', coalesce("status", '')), 'D')
    ) STORED;

CREATE INDEX IF NOT EXISTS user_search_vector_idx ON TB_USERS USING GIN (search_vector);