CREATE TABLE IF NOT EXISTS `audits` (
  `audit_id` int(11) NOT NULL AUTO_INCREMENT,
  `audit_name` varchar(75) NOT NULL,
  `audit_desc` varchar(105) NOT NULL,
  `audit_start` datetime NOT NULL,
  `audit_end` datetime NOT NULL,
  PRIMARY KEY (`audit_id`),
  UNIQUE KEY `audit_name` (`audit_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


