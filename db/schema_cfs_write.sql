\c postgres;

DROP DATABASE IF EXISTS cfs_write;

CREATE DATABASE cfs_write;

\c cfs_write;

-- Drop table

-- DROP TABLE public.cfs;

CREATE TABLE public.cfs_write (
	event_id uuid NOT NULL,
	agency_id uuid NOT NULL,
	user_id varchar NULL,
	event_number varchar NULL,
	event_type_code varchar NULL,
	event_time timestamp(0) NULL,
	dispatch_time timestamp(0) NULL,
	responder varchar NULL
);

INSERT INTO public.cfs_write (event_id,agency_id,user_id,event_number,event_type_code,event_time,dispatch_time,responder) VALUES
	 ('6a5c1d3f-d0b3-4954-a076-4a6531600c38'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3254027','SMO','2020-11-25 07:36:04','2020-11-26 13:55:46','OFFICER_001'),
	 ('e33f4d4d-1d7c-475d-b743-20dbc08b1f19'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234027','SMO','2020-11-26 07:36:04','2020-11-26 13:55:46','OFFICER_001'),
	 ('ddae6c42-70a4-48af-b033-7cefe01fb6e0'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_002','3234028','SMO','2020-11-27 07:36:04','2020-11-27 13:55:46','OFFICER_001'),
	 ('390b9cab-c026-488f-9f9b-ba275ace48e2'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_003','3234029','SMO','2020-11-28 07:36:04','2020-11-28 13:55:46','OFFICER_001'),
	 ('7d209f07-9c06-43e3-a5d7-c2568ab5f98e'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234030','SMO','2020-11-26 07:36:04','2020-11-28 13:55:46','OFFICER_001'),
	 ('6934a701-bfb5-420a-ba77-ae4a950c5429'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_002','3234031','SMO','2020-11-25 07:36:04','2020-11-27 13:55:46','OFFICER_001'),
	 ('4f9af302-42b8-4911-815b-dcc123338d74'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234032','ABC','2020-11-25 07:36:04','2020-11-27 13:55:46','OFFICER_002'),
	 ('30afc378-7c6f-46c0-8ee6-ca931a30815e'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_003','3234033','ABC','2020-11-28 07:36:04','2020-11-29 13:55:46','OFFICER_002'),
	 ('8e7c72d9-c3c9-47fa-bd02-f312ad58f794'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_001','3234034','TMP','2020-11-26 07:36:04','2020-11-28 13:55:46','OFFICER_003'),
	 ('fbdae6e9-8ee9-4836-a7bd-06208efd8a32'::uuid,'562c89de-f140-4482-8ef5-5f1703b244a8'::uuid,'USER_005','3234036','TMP','2020-11-26 07:36:04','2020-11-28 13:55:46','OFFICER_005');
INSERT INTO public.cfs_write (event_id,agency_id,user_id,event_number,event_type_code,event_time,dispatch_time,responder) VALUES
	 ('c6f14c49-2133-418b-a9b5-ce791e2140bb'::uuid,'562c89de-f140-4482-8ef5-5f1703b286b6'::uuid,'USER_002','3234037','AXO','2020-11-29 07:36:04','2020-11-30 13:55:46','OFFICER_002');