CREATE TABLE movie(
    id SERIAL NOT NULL,
    title TEXT NOT NULL,
    realiseDate DATE NOT NULL,
    pk_actor INTEGER NOT NULL,
    CONSTRAINT pk_movie PRIMARY KEY (id),
    CONSTRAINT pk_actor FOREIGN KEY(pk_actor) REFERENCES actor (id)
);
CREATE TABLE actor(
    id SERIAL NOT NULL,
    actor_name TEXT NOT NULL,
    CONSTRAINT pk_actor PRIMARY KEY (id)
);