# LojaAmigurumi
Site de vendas Amigurumi

# Iniciar o container com o Banco 
docker-compose up -d

# Acessar o container
docker exec -it LojaAmigurumi_container psql -U postgres -d LojaAmigurumi
