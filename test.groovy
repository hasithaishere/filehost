import jenkins.automation.builders.BaseJobBuilder

new BaseJobBuilder(
     name: "sample-job",
     description: "Description of your job",
     emails: ["foo@example.com","bar@example.com"] 
).build(this)
