provider "aws" {
  region = "us-east-1"
}

resource "aws_ecr_repository" "challenge-images" {
  name = "challenge-images"
  image_tag_mutability = "MUTABLE"
}