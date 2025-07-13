CREATE TABLE tb_cadastro (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    img_url VARCHAR(255),
    idade INT,
    missoes_id BIGINT,
    CONSTRAINT fk_missoes FOREIGN KEY (missoes_id) REFERENCES missoes(id)
);
