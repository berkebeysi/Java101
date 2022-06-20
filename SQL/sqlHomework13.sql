-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee(
	id INTEGER,
	name VARCHAR(50),
	birthday DATE,
	email VARCHAR(100)
);

-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (id, name, birthday, email) values (1, 'Cobbie', '1999-12-16', 'cstanes0@google.cn');
insert into employee (id, name, birthday, email) values (2, 'Dita', '1944-09-17', 'dkemp1@vistaprint.com');
insert into employee (id, name, birthday, email) values (3, 'Magdalene', '1938-01-31', 'mthurstan2@nyu.edu');
insert into employee (id, name, birthday, email) values (4, 'Shirline', '1978-08-02', 'svaudre3@google.de');
insert into employee (id, name, birthday, email) values (5, 'Jecho', '1939-01-10', 'jasp4@infoseek.co.jp');
insert into employee (id, name, birthday, email) values (6, 'Jeddy', '1908-05-25', 'jcockle5@parallels.com');
insert into employee (id, name, birthday, email) values (7, 'Rafaela', '1957-07-08', 'rchinery6@csmonitor.com');
insert into employee (id, name, birthday, email) values (8, 'Florencia', '1932-10-01', 'frannald7@washington.edu');
insert into employee (id, name, birthday, email) values (9, 'Darcey', '1985-04-17', 'dthorouggood8@nationalgeographic.com');
insert into employee (id, name, birthday, email) values (10, 'Mandi', '1907-06-18', 'mfarrall9@thetimes.co.uk');
insert into employee (id, name, birthday, email) values (11, 'Vidovic', '1944-04-29', 'vstandringa@csmonitor.com');
insert into employee (id, name, birthday, email) values (12, 'Nerissa', '1929-08-10', 'nandriolib@census.gov');
insert into employee (id, name, birthday, email) values (13, 'Dale', '1938-12-25', 'dbeldumc@github.com');
insert into employee (id, name, birthday, email) values (14, 'Lilas', '1999-05-26', 'lloyd@netlog.com');
insert into employee (id, name, birthday, email) values (15, 'Ulrich', '1910-11-16', 'ucartmere@altervista.org');
insert into employee (id, name, birthday, email) values (16, 'Walton', '1980-08-03', 'wtwigginsf@squidoo.com');
insert into employee (id, name, birthday, email) values (17, 'Dollie', '1938-05-06', 'dburnesg@thetimes.co.uk');
insert into employee (id, name, birthday, email) values (18, 'Loren', '1998-06-12', 'lhacquelh@youtu.be');
insert into employee (id, name, birthday, email) values (19, 'Annabela', '1919-07-25', 'alandsburyi@de.vu');
insert into employee (id, name, birthday, email) values (20, 'Corinne', '1986-10-08', 'ctrouncerj@engadget.com');
insert into employee (id, name, birthday, email) values (21, 'Hilary', '1917-02-16', 'hwedgbrowk@prweb.com');
insert into employee (id, name, birthday, email) values (22, 'Sissy', '1902-07-10', 'slugsdinl@instagram.com');
insert into employee (id, name, birthday, email) values (23, 'Jerry', '1989-04-14', 'jlegenm@behance.net');
insert into employee (id, name, birthday, email) values (24, 'Tracy', '1983-06-02', 'tborthn@unblog.fr');
insert into employee (id, name, birthday, email) values (25, 'Dorie', '1944-09-16', 'drappaporto@craigslist.org');
insert into employee (id, name, birthday, email) values (26, 'Blaine', '1902-04-30', 'bgoninp@canalblog.com');
insert into employee (id, name, birthday, email) values (27, 'Merlina', '1926-09-09', 'mileyq@gizmodo.com');
insert into employee (id, name, birthday, email) values (28, 'Adolpho', '1905-01-30', 'alutasr@si.edu');
insert into employee (id, name, birthday, email) values (29, 'Patty', '1946-10-04', 'pbartellis@sitemeter.com');
insert into employee (id, name, birthday, email) values (30, 'Shawna', '1905-11-11', 'sgaifordt@tinyurl.com');
insert into employee (id, name, birthday, email) values (31, 'Tuckie', '1970-03-06', 'telldredu@fema.gov');
insert into employee (id, name, birthday, email) values (32, 'Marve', '1906-02-15', 'mmationv@bloglovin.com');
insert into employee (id, name, birthday, email) values (33, 'Bradley', '1916-06-30', 'bharradinew@printfriendly.com');
insert into employee (id, name, birthday, email) values (34, 'Reggie', '1978-05-18', 'rormerodx@rambler.ru');
insert into employee (id, name, birthday, email) values (35, 'Jarrid', '1945-05-17', 'jismeady@cbslocal.com');
insert into employee (id, name, birthday, email) values (36, 'Lonnie', '1908-12-16', 'locurrinez@edublogs.org');
insert into employee (id, name, birthday, email) values (37, 'Aurelea', '1949-10-06', 'aswinburne10@psu.edu');
insert into employee (id, name, birthday, email) values (38, 'Hunfredo', '1975-01-29', 'hsancraft11@prnewswire.com');
insert into employee (id, name, birthday, email) values (39, 'Trefor', '1963-10-23', 'tkanzler12@google.nl');
insert into employee (id, name, birthday, email) values (40, 'Adele', '1939-01-14', 'alammin13@dailymotion.com');
insert into employee (id, name, birthday, email) values (41, 'Alla', '1929-09-24', 'aohogertie14@yandex.ru');
insert into employee (id, name, birthday, email) values (42, 'Kalle', '1941-10-13', 'kdeners15@tripod.com');
insert into employee (id, name, birthday, email) values (43, 'Jasen', '1961-12-12', 'jbriskey16@ask.com');
insert into employee (id, name, birthday, email) values (44, 'Virginia', '1946-04-12', 'vingraham17@mediafire.com');
insert into employee (id, name, birthday, email) values (45, 'Eldridge', '1929-12-17', 'edownton18@wordpress.org');
insert into employee (id, name, birthday, email) values (46, 'Keenan', '1988-09-21', 'kbirkett19@smh.com.au');
insert into employee (id, name, birthday, email) values (47, 'Umberto', '1939-09-14', 'usuerz1a@symantec.com');
insert into employee (id, name, birthday, email) values (48, 'Elena', '1921-11-09', 'enewband1b@house.gov');
insert into employee (id, name, birthday, email) values (49, 'Fletcher', '1929-10-04', 'fperazzo1c@google.it');
insert into employee (id, name, birthday, email) values (50, 'Bettine', '1958-01-18', 'bdaverin1d@imgur.com');

-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET name = 'Cem'
WHERE name LIKE 'B%';

UPDATE employee
SET email = 'XXXXXXX'
WHERE name LIKE 'Z%';

UPDATE employee
SET name = 'AAAAAAAA'
WHERE name LIKE 'B__%';

UPDATE employee
SET name = 'ALİ'
WHERE name ILIKE '%K%L';

UPDATE employee
SET name = 'BERKE'
WHERE name LIKE '____';

-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

DELETE FROM employee WHERE id=32;
DELETE FROM employee WHERE name='BERKE';
DELETE FROM employee WHERE birthday='1938-01-31';
DELETE FROM employee WHERE email='jcockle5@parallels.com';
DELETE FROM employee WHERE id=14;