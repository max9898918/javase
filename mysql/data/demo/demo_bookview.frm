TYPE=VIEW
query=select `demo`.`demo_book`.`fBookID` AS `fBookID`,`demo`.`demo_book`.`fBookName` AS `fBookName`,`demo`.`demo_book`.`fPrice` AS `fPrice`,`demo`.`demo_book`.`fISBN` AS `fISBN`,`demo`.`demo_bookstore`.`fAmount` AS `fAmount` from (`demo`.`demo_book` left join `demo`.`demo_bookstore` on(((`demo`.`demo_book`.`fBookID` = `demo`.`demo_bookstore`.`fBookID`) and (1 = 1))))
md5=2b69c167bc43f8aae16daac608c13097
updatable=0
algorithm=0
definer_user=root
definer_host=%
suid=2
with_check_option=0
timestamp=2016-03-22 07:53:40
create-version=1
source=select DEMO_Book.fBookID, DEMO_Book.fBookName, DEMO_Book.fPrice, DEMO_Book.fISBN, DEMO_BookStore.fAmount\nfrom DEMO_Book left join DEMO_BookStore on DEMO_Book.fBookID = DEMO_BookStore.fBookID and\n 1=1
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `demo`.`demo_book`.`fBookID` AS `fBookID`,`demo`.`demo_book`.`fBookName` AS `fBookName`,`demo`.`demo_book`.`fPrice` AS `fPrice`,`demo`.`demo_book`.`fISBN` AS `fISBN`,`demo`.`demo_bookstore`.`fAmount` AS `fAmount` from (`demo`.`demo_book` left join `demo`.`demo_bookstore` on(((`demo`.`demo_book`.`fBookID` = `demo`.`demo_bookstore`.`fBookID`) and (1 = 1))))
