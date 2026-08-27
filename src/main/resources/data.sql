-- ============================================================
-- Full-Text Search com PostgreSQL tsvector + unaccent
-- Adiciona search_vector como coluna gerada (STORED) em todas
-- as tabelas, com pesos por campo, sem sensibilidade a acento,
-- e indice GIN para busca.
-- ============================================================

-- ─── PRÉ-REQUISITOS (rodar uma única vez no banco) ─────────
CREATE EXTENSION IF NOT EXISTS unaccent;

CREATE OR REPLACE FUNCTION immutable_unaccent(text)
RETURNS text
LANGUAGE sql
IMMUTABLE
PARALLEL SAFE
STRICT
AS $$
SELECT public.unaccent('public.unaccent', $1)
           $$;

-- ─── TB_CATEGORIES ──────────────────────────────────────────
DROP INDEX IF EXISTS category_search_vector_idx;
ALTER TABLE TB_CATEGORIES DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_CATEGORIES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("category_group", ''))), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS category_search_vector_idx ON TB_CATEGORIES USING GIN (search_vector);

-- ─── TB_PERMISSIONS ─────────────────────────────────────────
DROP INDEX IF EXISTS permission_search_vector_idx;
ALTER TABLE TB_PERMISSIONS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_PERMISSIONS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("code", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS permission_search_vector_idx ON TB_PERMISSIONS USING GIN (search_vector);

-- ─── TB_ROLES ───────────────────────────────────────────────
DROP INDEX IF EXISTS role_search_vector_idx;
ALTER TABLE TB_ROLES DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_ROLES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("code", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS role_search_vector_idx ON TB_ROLES USING GIN (search_vector);

-- ─── TB_USERS ───────────────────────────────────────────────
DROP INDEX IF EXISTS user_search_vector_idx;
ALTER TABLE TB_USERS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_USERS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("username", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("phone", ''))), 'C') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("status", ''))), 'D')
            ) STORED;
CREATE INDEX IF NOT EXISTS user_search_vector_idx ON TB_USERS USING GIN (search_vector);

-- ─── TB_ORGANIZATIONS ──────────────────────────────────────
DROP INDEX IF EXISTS organization_search_vector_idx;
ALTER TABLE TB_ORGANIZATIONS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_ORGANIZATIONS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("email", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'C') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("address", ''))), 'D')
            ) STORED;
CREATE INDEX IF NOT EXISTS organization_search_vector_idx ON TB_ORGANIZATIONS USING GIN (search_vector);

-- ─── TB_PRODUCTS ────────────────────────────────────────────
DROP INDEX IF EXISTS product_search_vector_idx;
ALTER TABLE TB_PRODUCTS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_PRODUCTS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'B')
            ) STORED;
CREATE INDEX IF NOT EXISTS product_search_vector_idx ON TB_PRODUCTS USING GIN (search_vector);

-- ─── TB_INTERPRETERS ──────────────────────────────
DROP INDEX IF EXISTS interpreter_search_vector_idx;
ALTER TABLE TB_INTERPRETERS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_INTERPRETERS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'B')
            ) STORED;
CREATE INDEX IF NOT EXISTS interpreter_search_vector_idx ON TB_INTERPRETERS USING GIN (search_vector);

-- ─── TB_INTERPRETER_LANGUAGES ──────────────────────────────
DROP INDEX IF EXISTS interpreter_language_search_vector_idx;
ALTER TABLE TB_INTERPRETER_LANGUAGES DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_INTERPRETER_LANGUAGES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("country_language", ''))), 'B')
            ) STORED;
CREATE INDEX IF NOT EXISTS interpreter_language_search_vector_idx ON TB_INTERPRETER_LANGUAGES USING GIN (search_vector);

-- ─── TB_TOUR_GUIDES ────────────────────────────────────────
DROP INDEX IF EXISTS tour_guide_search_vector_idx;
ALTER TABLE TB_TOUR_GUIDES DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_TOUR_GUIDES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'B')
            ) STORED;
CREATE INDEX IF NOT EXISTS tour_guide_search_vector_idx ON TB_TOUR_GUIDES USING GIN (search_vector);

-- ─── TB_TOURIST_AREAS ──────────────────────────────────────
DROP INDEX IF EXISTS tourist_area_search_vector_idx;
ALTER TABLE TB_TOURIST_AREAS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_TOURIST_AREAS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("name", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("state", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("address", ''))), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS tourist_area_search_vector_idx ON TB_TOURIST_AREAS USING GIN (search_vector);

-- ─── TB_ORGANIZATION_HIGHLIGHTS ────────────────────────────
DROP INDEX IF EXISTS organization_highlights_search_vector_idx;
ALTER TABLE TB_ORGANIZATION_HIGHLIGHTS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_ORGANIZATION_HIGHLIGHTS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A')
            ) STORED;
CREATE INDEX IF NOT EXISTS organization_highlights_search_vector_idx ON TB_ORGANIZATION_HIGHLIGHTS USING GIN (search_vector);

-- ─── TB_PRODUCT_PROMOTIONS ─────────────────────────────────
DROP INDEX IF EXISTS product_promotion_search_vector_idx;
ALTER TABLE TB_PRODUCT_PROMOTIONS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_PRODUCT_PROMOTIONS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A')
            ) STORED;
CREATE INDEX IF NOT EXISTS product_promotion_search_vector_idx ON TB_PRODUCT_PROMOTIONS USING GIN (search_vector);

-- ─── TB_DOCUMENT_FILES ────────────────────────────────────────
DROP INDEX IF EXISTS document_files_search_vector_idx;
ALTER TABLE TB_DOCUMENT_FILES DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_DOCUMENT_FILES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("title", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("description", ''))), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS document_files_search_vector_idx ON TB_DOCUMENT_FILES USING GIN (search_vector);

-- ─── TB_ORGANIZATION_CATEGORY ────────────────────────────────────────
DROP INDEX IF EXISTS organization_category_search_vector_idx;
ALTER TABLE TB_ORGANIZATION_CATEGORY DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_ORGANIZATION_CATEGORY
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("concat", ''))), 'A')
            ) STORED;
CREATE INDEX IF NOT EXISTS organization_category_search_vector_idx ON TB_ORGANIZATION_CATEGORY USING GIN (search_vector);

-- ─── TB_REVIEWS ────────────────────────────────────────────────
DROP INDEX IF EXISTS review_search_vector_idx;
ALTER TABLE TB_REVIEWS DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_REVIEWS
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("content", ''))), 'A')
            ) STORED;
CREATE INDEX IF NOT EXISTS review_search_vector_idx ON TB_REVIEWS USING GIN (search_vector);

-- ─── TB_ADDRESSES ──────────────────────────────────────────────
DROP INDEX IF EXISTS address_search_vector_idx;
ALTER TABLE TB_ADDRESSES DROP COLUMN IF EXISTS search_vector;
ALTER TABLE TB_ADDRESSES
    ADD COLUMN search_vector tsvector
        GENERATED ALWAYS AS (
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("state", ''))), 'A') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("municipality", ''))), 'B') ||
            setweight(to_tsvector('portuguese', immutable_unaccent(coalesce("address", ''))), 'C')
            ) STORED;
CREATE INDEX IF NOT EXISTS address_search_vector_idx ON TB_ADDRESSES USING GIN (search_vector);