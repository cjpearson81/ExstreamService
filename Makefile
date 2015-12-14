all:
	docker build -t payx/exstream .
run:
	docker run -d -p 9090:9090 -t payx/exstream