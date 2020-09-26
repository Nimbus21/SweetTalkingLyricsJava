INSERT INTO TB_ARTISTA (cd_artista, nm_artista) VALUES (SQ_TB_ARTISTA.nextval, 'Twice');

INSERT INTO TB_ALBUM (cd_album, nm_album, cd_artista) VALUES (SQ_TB_ALBUM.nextval, 'Twicetagram', 1);

INSERT INTO TB_MUSICA (cd_musica, ds_idioma_musica, nm_musica) VALUES (SQ_TB_MUSICA.nextval, 'Coreano', 'Likey');

INSERT INTO TB_MUSICA_ALBUM (cd_album, cd_musica) VALUES (1, 1);

INSERT INTO TB_LETRA (cd_letra, ds_letra, ds_idioma_letra, cd_musica) VALUES (SQ_TB_LETRA.nextval, 'ThandyTranslator', 'Inglês', 1);

INSERT INTO TB_VERSO (cd_verso, nm_cantor, tx_verso, cd_letra) VALUES (SQ_TB_VERSO.nextval, 'Nayeon', 'Come a little closer, please know my heart', 1);

INSERT INTO TB_VERSO (cd_verso, nm_cantor, tx_verso, cd_letra) VALUES (SQ_TB_VERSO.nextval, 'Momo', 'Put on BB cream, pat pat pat', 1);
/*
Esse aqui é pra Oracle, MySQL, H2
*/

/* Esse aqui é pra SQLServer que é um banco extremamente idiota*/
/*
INSERT INTO TB_ARTISTA (cd_artista, nm_artista) VALUES (NEXT VALUE FOR SQ_TB_ARTISTA, 'Twice');

INSERT INTO TB_ALBUM (cd_album, nm_album, cd_artista) VALUES (NEXT VALUE FOR SQ_TB_ALBUM, 'Twicetagram', 1);

INSERT INTO TB_MUSICA (cd_musica, ds_idioma_musica, nm_musica) VALUES (NEXT VALUE FOR SQ_TB_MUSICA, 'Coreano', 'Likey');

INSERT INTO TB_MUSICA_ALBUM (cd_album, cd_musica) VALUES (1, 1);

INSERT INTO TB_LETRA (cd_letra, ds_letra, ds_idioma_letra, cd_musica) VALUES (NEXT VALUE FOR SQ_TB_LETRA, 'ThandyTranslator', 'Inglês', 1);

INSERT INTO TB_VERSO (cd_verso, nm_cantor, tx_verso, cd_letra) VALUES (NEXT VALUE FOR SQ_TB_VERSO, 'Nayeon', 'Come a little closer, please know my heart', 1);

INSERT INTO TB_VERSO (cd_verso, nm_cantor, tx_verso, cd_letra) VALUES (NEXT VALUE FOR SQ_TB_VERSO, 'Momo', 'Put on BB cream, pat pat pat', 1);
*/