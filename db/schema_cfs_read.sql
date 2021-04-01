\c postgres;

DROP DATABASE IF EXISTS cfs_read;

CREATE DATABASE cfs_read;

\c cfs_read;

-- Drop table

-- DROP TABLE public.cfs;

CREATE TABLE public.cfs_read (
	event_id uuid NOT NULL,
	agency_id uuid NOT NULL,
	user_id varchar NULL,
	event_number varchar NULL,
	event_type_code varchar NULL,
	event_time timestamp(0) NULL,
	dispatch_time timestamp(0) NULL,
	responder varchar NULL
);

INSERT INTO public.cfs_read (event_id,agency_id,user_id,event_number,event_type_code,event_time,dispatch_time,responder) VALUES
	 ('4987c2a4-1481-4fde-8836-5833f936f082'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3254027','SMO','2020-11-25 07:36:04','2020-11-26 13:55:46','OFFICER_001'),
	 ('131856c6-368b-46fd-8881-6b8ece09d958'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234027','SMO','2020-11-26 07:36:04','2020-11-26 13:55:46','OFFICER_001'),
	 ('c4df1d12-f0f3-4597-8792-8b7e882b26d3'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_002','3234028','SMO','2020-11-27 07:36:04','2020-11-27 13:55:46','OFFICER_001'),
	 ('78fa821a-45f9-4ffe-aa12-5f6d3ae814c7'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_003','3234029','SMO','2020-11-28 07:36:04','2020-11-28 13:55:46','OFFICER_001'),
	 ('8bb9543a-7dc2-47ca-825c-664f3edf95a5'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234030','SMO','2020-11-26 07:36:04','2020-11-28 13:55:46','OFFICER_001'),
	 ('a9ef1d13-e139-4c66-8a50-f722ea2188ae'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_002','3234031','SMO','2020-11-25 07:36:04','2020-11-27 13:55:46','OFFICER_001'),
	 ('efd4bd89-ec83-4e64-8955-948e347e5b27'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234032','ABC','2020-11-25 07:36:04','2020-11-27 13:55:46','OFFICER_002'),
	 ('8bb75a3f-7693-4c52-802f-363f78e8e318'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_003','3234033','ABC','2020-11-28 07:36:04','2020-11-29 13:55:46','OFFICER_002'),
	 ('22e1d22a-9558-413f-8fd8-c5abc9d005ea'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234034','TMP','2020-11-26 07:36:04','2020-11-28 13:55:46','OFFICER_003'),
	 ('b2bca55f-d600-4139-bb57-629765221654'::uuid,'562c89de-f140-4482-8ef5-5f1703b244a8'::uuid,'USER_005','3234036','TMP','2020-11-26 07:36:04','2020-11-28 13:55:46','OFFICER_005');
INSERT INTO public.cfs_read (event_id,agency_id,user_id,event_number,event_type_code,event_time,dispatch_time,responder) VALUES
	 ('6d39d05d-1bc4-4f3e-89cf-d3de67bc1398'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_002','3234037','AXO','2020-11-29 07:36:04','2020-11-30 13:55:46','OFFICER_002');