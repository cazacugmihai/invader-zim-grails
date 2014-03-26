cucumber {
	tags = ["~@wip"]
	features = ["test/cucumber"]
	glue = ["test/cucumber/steps", "test/cucumber/support"]
    formats = [
        "json:target/test-reports/cucumber.json",
        "html:target/test-reports/cucumber"
    ]
}
