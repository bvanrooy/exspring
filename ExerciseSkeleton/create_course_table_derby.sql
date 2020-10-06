CREATE TABLE courses
 ( cid        CHAR(4)       NOT NULL ,
   cstitle    CHAR(45)      NOT NULL ,
   cltitle    VARCHAR(60)            ,
   cdur       SMALLINT      NOT NULL ,
   caprice    DECIMAL(9, 2) NOT NULL
  , PRIMARY KEY (cid)
 ) ;

INSERT INTO courses VALUES
 ( '7800' , 'IMSADFII'                                 ,
 'Development of conversational transactions using IMSADF', 5, 550.00) ;
INSERT INTO courses VALUES
 ( '7801' , 'IMSADFII advanced topics'                 ,
 'IMSADFII Advanced Topics'                               , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7810' , 'ADFPLUS'                                  ,
 'ADFPLUS preprocessors and utilities'                    , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '7820' , 'IMS/DB'                                   ,
 'IMS/DB application programming'                         , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '7830' , 'IMS/DC'                                   ,
 'IMS/DC application programming'                         , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7840' , 'Implementation of physical IMS data bases',
 'Implementation of physical IMS data bases'              , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7850' , 'DB2, an overview'                         ,
 'DB2, an overview'                                       , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '7860' , 'ISPF dialog management'                   ,
 'ISPF dialog management services'                        , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7870' , 'Generalized audit exit'                   ,
 'Generalized audit exit (GAEXIT)'                        , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7890' , 'Design of IMS data bases'                 ,
 'Design of IMS data bases'                               , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '7900' , 'Workshop SQL'                             ,
 'Workshop SQL'                                           , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '8001' , 'System development'                       ,
 'System development : management and methodology'        , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '8002' , 'Projectmanagement'                        ,
 'Projectmanagement'                                      , 4, 550.00) ;
INSERT INTO courses VALUES
 ( '8003' , 'Information analysis'                     ,
 'System analysis'                                        , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '8004' , 'System design'                            ,
 'System design'                                          , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '8005' , 'StructuredProgramming'                    ,
 'Structured programming'                                 , 5, 550.00) ;
INSERT INTO courses VALUES
 ( '8006' , 'Technical writing'                        ,
 'Writing, evaluation and correction of technical manuals', 1, 475.00) ;
INSERT INTO courses VALUES
 ( '8031' , 'SAS fundamentals'                         ,
 'SAS fundamentals course'                                , 3, 550.00) ;
INSERT INTO courses VALUES
 ( '8032' , 'Advanced SAS'                             ,
 'Advanced SAS course'                                    , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '8041' , 'Capacity planning'                        ,
 'Capacity planning : technics and strategies'            , 4, 550.00) ;
INSERT INTO courses VALUES
 ( '8042' , 'SRM parameters in MVS systems'            ,
 'Design of SRM parameters and tuning of MVS systems'     , 2, 550.00) ;
INSERT INTO courses VALUES
 ( '8043' , 'PC LAN'                                   ,
 'Seminar : PC LAN'                                       , 1, 500.00) ;
INSERT INTO courses VALUES
 ( '8051' , 'PC_DOS'                                   ,
 'Workshop PC-DOS'                                        , 2, 375.00) ;
INSERT INTO courses VALUES
 ( '8052' , 'DbaseIII programming'                     ,
 'DbaseIII (Plus) programming'                            , 3, 375.00) ;
INSERT INTO courses VALUES
 ( '8053' , 'CAD on PC'                                ,
 'CAD on PC'                                              , 1, 375.00) ;
INSERT INTO courses VALUES
 ( '8054' , 'DbaseIII systems'                         ,
 'DbaseIII systems'                                       , 3, 500.00) ;
INSERT INTO courses VALUES
 ( '8055' , 'LOTUS 123: programming'                   ,
 'LOTUS 123 (versie 2) programming'                       , 3, 375.00) ;
INSERT INTO courses VALUES
 ( '8056' , 'Autocad'                                  ,
 'Training Autocad'                                       , 2, 500.00) ;
 
 