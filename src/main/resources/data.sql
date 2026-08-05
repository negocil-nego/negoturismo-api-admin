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

-- ─── TB_ORGANIZATIONS ──────────────────────────────────────
ALTER TABLE TB_ORGANIZATIONS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
            setweight(to_tsvector('portuguese', coalesce("email", '')), 'B') ||
            setweight(to_tsvector('portuguese', coalesce("phone", '')), 'C') ||
            setweight(to_tsvector('portuguese', coalesce("description", '')), 'D') ||
            setweight(to_tsvector('portuguese', coalesce("address", '')), 'E')
            ) STORED;
CREATE INDEX organization_search_vector_idx ON TB_ORGANIZATIONS USING GIN (search_vector);

-- ─── TB_PRODUCTS ────────────────────────────────────────────
ALTER TABLE TB_PRODUCTS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
            setweight(to_tsvector('portuguese', coalesce("description", '')), 'B')
            ) STORED;
CREATE INDEX product_search_vector_idx ON TB_PRODUCTS USING GIN (search_vector);

-- ─── TB_INTERPRETER_LANGUAGES ──────────────────────────────
ALTER TABLE TB_INTERPRETER_LANGUAGES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A') ||
            setweight(to_tsvector('portuguese', coalesce("language", '')), 'B')
            ) STORED;
CREATE INDEX interpreter_language_search_vector_idx ON TB_INTERPRETER_LANGUAGES USING GIN (search_vector);

-- ─── TB_TOUR_GUIDES ────────────────────────────────────────
ALTER TABLE TB_TOUR_GUIDES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A')
            ) STORED;
CREATE INDEX tour_guide_search_vector_idx ON TB_TOUR_GUIDES USING GIN (search_vector);

-- ─── TB_TOURIST_AREAS ──────────────────────────────────────
ALTER TABLE TB_TOURIST_AREAS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
            setweight(to_tsvector('portuguese', coalesce("state", '')), 'B') ||
            setweight(to_tsvector('portuguese', coalesce("address", '')), 'C')
            ) STORED;
CREATE INDEX tourist_area_search_vector_idx ON TB_TOURIST_AREAS USING GIN (search_vector);