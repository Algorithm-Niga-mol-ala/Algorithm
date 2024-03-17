SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(date_of_birth, '%Y-%m-%d') as DATE_OF_BIRTH from member_profile where tlno is not null and month(date_of_birth)=03 and gender = "W";
