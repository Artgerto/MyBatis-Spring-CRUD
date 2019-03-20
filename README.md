# MyBatis-Spring-CRUD
### PostgreSQL - Note (table)
```sql
CREATE TABLE public.note
(
    id integer NOT NULL DEFAULT nextval('notes_id_seq'::regclass),
    date date NOT NULL,
    title character varying(150) COLLATE pg_catalog."default" NOT NULL,
    text text COLLATE pg_catalog."default",
    CONSTRAINT id_primary PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;
```
### Start point (Spring boot)
DemoApplication - main
