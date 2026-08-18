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
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("email", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'C') ||
    setweight(to_tsvector('portuguese', coalesce("address", '')), 'D')
    ) STORED;
CREATE INDEX IF NOT EXISTS organization_search_vector_idx ON TB_ORGANIZATIONS USING GIN (search_vector);

-- ─── TB_PRODUCTS ────────────────────────────────────────────
ALTER TABLE TB_PRODUCTS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'B')
    ) STORED;
CREATE INDEX IF NOT EXISTS product_search_vector_idx ON TB_PRODUCTS USING GIN (search_vector);

-- ─── TB_INTERPRETER ──────────────────────────────
ALTER TABLE TB_INTERPRETERS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'B')
    ) STORED;
CREATE INDEX IF NOT EXISTS interpreter_search_vector_idx ON TB_INTERPRETERS USING GIN (search_vector);

-- ─── TB_INTERPRETER_LANGUAGES ──────────────────────────────
ALTER TABLE TB_INTERPRETER_LANGUAGES
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("country_language", '')), 'B')
    ) STORED;
CREATE INDEX IF NOT EXISTS interpreter_language_search_vector_idx ON TB_INTERPRETER_LANGUAGES USING GIN (search_vector);

-- ─── TB_TOUR_GUIDES ────────────────────────────────────────
ALTER TABLE TB_TOUR_GUIDES
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'B')
    ) STORED;
CREATE INDEX IF NOT EXISTS tour_guide_search_vector_idx ON TB_TOUR_GUIDES USING GIN (search_vector);

-- ─── TB_TOURIST_AREAS ──────────────────────────────────────
ALTER TABLE TB_TOURIST_AREAS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("name", '')), 'A') ||
            setweight(to_tsvector('portuguese', coalesce("state", '')), 'B') ||
            setweight(to_tsvector('portuguese', coalesce("address", '')), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS tourist_area_search_vector_idx ON TB_TOURIST_AREAS USING GIN (search_vector);

-- ─── TB_ORGANIZATION_HIGHLIGHTS ────────────────────────────
ALTER TABLE TB_ORGANIZATION_HIGHLIGHTS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A')
            ) STORED;
CREATE INDEX IF NOT EXISTS organization_highlights_search_vector_idx ON TB_ORGANIZATION_HIGHLIGHTS USING GIN (search_vector);

-- ─── TB_PRODUCT_PROMOTIONS ─────────────────────────────────
ALTER TABLE TB_PRODUCT_PROMOTIONS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A')
            ) STORED;
CREATE INDEX IF NOT EXISTS product_promotion_search_vector_idx ON TB_PRODUCT_PROMOTIONS USING GIN (search_vector);

-- ─── TB_DOCUMENT_FILES ────────────────────────────────────────
ALTER TABLE TB_DOCUMENT_FILES
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("title", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("description", '')), 'C')
    ) STORED;
CREATE INDEX IF NOT EXISTS document_files_search_vector_idx ON TB_DOCUMENT_FILES USING GIN (search_vector);

-- ─── TB_ORGANIZATION_CATEGORY ────────────────────────────────────────
ALTER TABLE TB_ORGANIZATION_CATEGORY
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("concat", '')), 'A')
    ) STORED;
CREATE INDEX IF NOT EXISTS organization_category_search_vector_idx ON TB_ORGANIZATION_CATEGORY USING GIN (search_vector);

-- ─── TB_REVIEWS ────────────────────────────────────────────────
ALTER TABLE TB_REVIEWS
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("content", '')), 'A')
    ) STORED;
CREATE INDEX IF NOT EXISTS review_search_vector_idx ON TB_REVIEWS USING GIN (search_vector);

-- ─── TB_ADDRESSES ──────────────────────────────────────────────
ALTER TABLE TB_ADDRESSES
    ADD COLUMN IF NOT EXISTS search_vector tsvector
    GENERATED ALWAYS AS (
    setweight(to_tsvector('portuguese', coalesce("state", '')), 'A') ||
    setweight(to_tsvector('portuguese', coalesce("municipality", '')), 'B') ||
    setweight(to_tsvector('portuguese', coalesce("address", '')), 'C')
    ) STORED;
CREATE INDEX IF NOT EXISTS address_search_vector_idx ON TB_ADDRESSES USING GIN (search_vector);