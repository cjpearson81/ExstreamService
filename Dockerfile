FROM openshift/base-centos7
MAINTAINER Chris Pearson <cpearson@paychex.com>

#Install Java 8
RUN yum install -y --enablerepo=centosplus \
    tar unzip bc which lsof java-1.8.0-openjdk java-1.8.0-openjdk-devel && \
    yum clean all -y && \
    mkdir -p /opt/openshift
    
LABEL io.k8s.description="Image for running ExstreamService" \
      io.k8s.display-name="ExstreamService spring boot image" \
      io.openshift.expose-services="9090:http" \
      io.openshift.tags="exstream,springboot"
    
USER 1001

EXPOSE 9090

COPY ./build/libs/ExstreamService.jar /opt/openshift

CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/openshift/ExstreamService.jar"]