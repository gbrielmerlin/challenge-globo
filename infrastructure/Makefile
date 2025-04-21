.PHONY: all vpc ecr cache eks

all: vpc ecr cache eks

vpc:
	cd vpc && terraform init && terraform apply -auto-approve

ecr:
	cd ecr && terraform init && terraform apply -auto-approve

cache:
	cd cache && terraform init && terraform apply -auto-approve \
	-var="subnet_ids=$(shell terraform -chdir=vpc output -json subnet_ids | jq -r '.[]')"

eks:
	cd eks && terraform init && terraform apply -auto-approve \
	-var="vpc_id=$(shell terraform -chdir=vpc output -raw vpc_id)" \
	-var="subnet_ids=$(shell terraform -chdir=vpc output -json subnet_ids | jq -c)"