provider "aws" {
  region = "us-east-1"
}

variable "vpc_id" {
  type = string
}

variable "subnet_ids" {
  type = list(string)
}

module "eks" {
  source          = "terraform-aws-modules/eks/aws"
  cluster_name    = "eks-challenge"
  cluster_version = "1.31"
  subnets         = var.subnet_ids
  vpc_id          = var.vpc_id

  node_groups = {
    default = {
      desired_capacity = 2
      max_capacity     = 3
      min_capacity     = 1

      instance_types = ["t3.medium"]
    }
  }
}