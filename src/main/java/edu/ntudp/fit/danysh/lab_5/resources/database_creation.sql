CREATE TABLE public.students
(
    id serial NOT NULL,
    student_id integer NOT NULL,
    first_name character varying(255) NOT NULL,
    last_name character varying(255) NOT NULL,
    patronymic character varying(255) NOT NULL,
    date_of_birth date NOT NULL,
    CONSTRAINT student_pkey PRIMARY KEY (id),
    CONSTRAINT student_id_key UNIQUE (id, student_id)
);

ALTER TABLE IF EXISTS public.students
    OWNER to postgres;