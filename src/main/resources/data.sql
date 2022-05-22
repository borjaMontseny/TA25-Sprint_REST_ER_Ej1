DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

create table fabricantes(
ID int not null auto_increment,
NOMBRE varchar(100),
primary key (id)
);

create table articulos(
ID int not null auto_increment,
NOMBRE varchar(100),
PRECIO int,
FABRICANTE int,
primary key (ID),
foreign key (FABRICANTE) references fabricantes(ID)
);


insert into fabricantes(NOMBRE)
values ('HP');


insert into fabricantes(NOMBRE)
values ('Dell');

insert into fabricantes(NOMBRE)
values ('Toshiba');

insert into fabricantes(NOMBRE)
values ('Intel');

insert into fabricantes(NOMBRE)
values ('Philips');

insert into fabricantes(NOMBRE)
values ('Samsung');

insert into articulos(NOMBRE, PRECIO, FABRICANTE)
values ('Portatil Gamer X50', '899', '1');

insert into articulos(NOMBRE, PRECIO, FABRICANTE)
values ('CPU Intel Core i5', '80', '2');

insert into articulos(NOMBRE, PRECIO, FABRICANTE)
values ('Impresora laser', '80', '3');

insert into articulos(NOMBRE, PRECIO, FABRICANTE)
values ('Funda Portatil 15.6"', '20', '4');

insert into articulos(NOMBRE, PRECIO, FABRICANTE)
values ('Monitor 24"', '120', '5');

insert into articulos(NOMBRE, PRECIO, FABRICANTE)
values ('Galaxy S22 Plus', '699', '6');