# The Merge Request Presentation
- [ ] Must contain a reference to the Jira ticket in the title
- [ ] Must contain a description of the change - this is not the duplication of the ticket but a summary of the change along with sufficient narration to help the reviewer do their review
- [ ] Must include references to upstream and downstream dependent MRs
- [ ] Should contain annotations by the author where necessary



# Review Pre-requisites
- [ ] All code must have been developer/local tested prior to creation of the MR (for Draft / WIP MRs, this would be prior to the Draft status being removed).  The reviewers are obliged to determine that this has been done to a satisfactory level

# The Review - General
- Must be done in a timely manner
- Should be approved by TWO approvers
- Comments must be polite
- Comments should be expressed in natural language
- Should suggest improvements
- Must be merged by someone approved to merge code

# The Review - Checklist
- [ ] The documentation must be updated - README.md and changelog.md
- [ ] The code must meet the acceptance criteria (i.e. it must do what it is supposed to)
- [ ] The code should be as simple as possible
- [ ] The code should be easily understandable (i.e. someone new to the project should be able to understand the code)
- [ ] Code coverage of new code should meet the required 90%, use the IntelliJ code coverage tool / SonarQube to check
- [ ] The code should meet the clean code guidelines
- [ ] Opportunities to improve existing code could been taken
- [ ] The changes should include 'clean as you code' consideration
- [ ] The changes must not regress the SonarQube metrics (check the SonarQube reports)
- [ ] UI changes must include annotated screenshots of the changes a usability test tool such as Wave or AXE
- [ ] Front end changes should have been tested using
- [ ] Evidence that the code changes have been integration tested should be provided

# Merging
- [ ] Review comments should be resolved by the person raising the comment, not by the developer who created the MR.
- [ ] All review comments should be resolved before merging