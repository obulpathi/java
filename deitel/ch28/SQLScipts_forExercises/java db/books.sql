DROP TABLE "authorISBN";
DROP TABLE "titles";
DROP TABLE "authors";

CREATE TABLE "authors" (
   "authorID" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
   "firstName" varchar (20) NOT NULL,
   "lastName" varchar (30) NOT NULL,
   PRIMARY KEY ("authorID")
);

CREATE TABLE "titles" (
   "isbn" varchar (20) NOT NULL,
   "title" varchar (100) NOT NULL,
   "editionNumber" INT NOT NULL,
   "copyright" varchar (4) NOT NULL,
   PRIMARY KEY ("isbn")
);

CREATE TABLE "authorISBN" (
   "authorID" INT NOT NULL,
   "isbn" varchar (20) NOT NULL,
   FOREIGN KEY ("authorID") REFERENCES "authors" ("authorID"), 
   FOREIGN KEY ("isbn") REFERENCES "titles" ("isbn")
);

INSERT INTO "authors" ("firstName", "lastName")
VALUES 
   ('Paul','Deitel'), 
   ('Harvey','Deitel'),
   ('Abbey','Deitel'), 
   ('Michael','Morgano'),
   ('Eric','Kern');

INSERT INTO "titles" ("isbn","title","editionNumber",
   "copyright")
VALUES
   ('0132152134','Visual Basic 2010 How to Program',5,'2011'),
   ('0132151421','Visual C# 2010 How to Program',4,'2011'),
   ('0132575663','Java How to Program',9,'2012'), 
   ('0132662361','C++ How to Program',8,'2012'),
   ('0132404168','C How to Program',6,'2010'),
   ('013705842X','iPhone for Programmers: An App-Driven Approach',1,'2010'),
   ('0132121360','Android for Programmers: An App-Driven Approach',1,'2012');

INSERT INTO "authorISBN" ("authorID","isbn")
VALUES
   (1,'0132152134'),
   (2,'0132152134'),
   (1,'0132151421'),
   (2,'0132151421'),
   (1,'0132575663'), 
   (2,'0132575663'), 
   (1,'0132662361'),
   (2,'0132662361'),
   (1,'0132404168'),
   (2,'0132404168'),
   (1,'013705842X'),
   (2,'013705842X'),
   (3,'013705842X'),
   (4,'013705842X'),
   (5,'013705842X'),
   (1,'0132121360'),
   (2,'0132121360'),
   (3,'0132121360'),
   (4,'0132121360');