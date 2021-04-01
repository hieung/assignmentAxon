FROM postgres:latest

MAINTAINER "hieunt1912@gmail.com"

COPY schema_cfs_read.sql /docker-entrypoint-initdb.d/

COPY schema_cfs_write.sql /docker-entrypoint-initdb.d/

EXPOSE 5432

CMD ["postgres"]