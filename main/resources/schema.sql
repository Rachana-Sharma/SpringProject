DROP TABLE IF EXISTS BOOKING;
  
CREATE TABLE BOOKING (
  BOOKING_ID INT AUTO_INCREMENT  PRIMARY KEY,
  BREAKFAST VARCHAR(250)  NULL,
  ROOM_ID INT NOT  NULL,
  TOTAL_CHARGE DECIMAL  NULL,
  CUSTOMER_ID INT NULL
  START_DATE DATE NULL;
  END_DATE DATE NULL;
);



DROP TABLE IF EXISTS CUSTOMER;
  
CREATE TABLE CUSTOMER(
  CUSTOMER_ID INT AUTO_INCREMENT  PRIMARY KEY,
  CUSTOMER_NAME VARCHAR(250)  NULL
 );
 
 
 DROP TABLE IF EXISTS ROOM;
 CREATE TABLE ROOM (
  ROOM_ID INT AUTO_INCREMENT  PRIMARY KEY,
  ROOM_TYPE VARCHAR(250) NOT NULL,
  ROOM_PRICE DECIMAL NOT NULL,
  ROOM_STATUS VARCHAR(250)  NULL,
  BOOKING_ID INT NULL  
);
