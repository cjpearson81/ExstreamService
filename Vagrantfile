Vagrant.configure(2) do |config|

  config.vm.box = "ubuntu/trusty64"

   # Configure VM Ram usage
  config.vm.provider :virtualbox do |vb|
     vb.customize ["modifyvm", :id, "--memory", "1024"]
  end

  config.vm.provision "docker"

  config.vm.provision :docker_compose  #, yml: "/vagrant/docker-compose.yml", run: "always"

  config.vm.network :forwarded_port, host: 9090, guest: 9090

end
