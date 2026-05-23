# Contributing Guidelines

Thank you for contributing to the Java Learning Path repository.

This repository is designed not only to teach Java syntax, but also to introduce professional software engineering practices and collaborative development workflows.

Please read the following guidelines carefully before contributing.

---

# Development Workflow

## 1. Read the exercise specification carefully

Before implementing a solution:

- Understand the problem completely
- Identify edge cases
- Design your solution before coding

---

## 2. Keep solutions clean and readable

Preferred characteristics:

- Small focused methods
- Clear naming
- Separation of responsibilities
- Minimal duplication
- Consistent formatting

---

## 3. Incremental development

Recommended approach:

1. Make it work
2. Refactor
3. Improve readability
4. Handle edge cases
5. Optimize if necessary

---

# Branch Naming Convention

This repository follows:

https://conventional-branch.github.io/

---

## Branch Format

text <type>/<issue-id>-<short-description> 

---

## Examples

text feature/ej-007-prime-number feature/ej-028-bank-account fix/ej-014-random-number-bug refactor/ej-032-product-equals docs/readme-improvements 

---

## Allowed Branch Types

| Type | Purpose |
|---|---|
| feature | New exercise solution |
| fix | Bug fixes |
| refactor | Internal improvements |
| docs | Documentation |
| test | Test-related changes |
| chore | Repository maintenance |

---

# Commit Convention

This repository follows:

https://www.conventionalcommits.org/en/v1.0.0/

---

## Commit Format

text <type>: <description> 

---

## Examples

text feat: solve EJ-007 prime validator fix: handle division by zero refactor: simplify fibonacci implementation docs: improve setup instructions test: add palindrome edge cases 

---

## Allowed Commit Types

| Type | Purpose |
|---|---|
| feat | New feature or exercise solution |
| fix | Bug fix |
| refactor | Internal improvement |
| docs | Documentation |
| test | Tests |
| chore | Maintenance |

---

# Signed Commits Requirement

All commits MUST be signed.

Unsigned commits may be rejected.

---

## Verify commit signing

bash git log --show-signature 

---

## Example signed commit

bash git commit -S -m "feat: solve EJ-007 prime validator" 

---

## Configure Git signing

Example:

bash git config --global commit.gpgsign true 

---

# Pull Request Guidelines

## PR Title Format

text <type>: <short-description> 

---

## Example

text feat: solve EJ-014 guessing game 

---

# Pull Request Checklist

Before opening a PR:

- [ ] Code compiles successfully
- [ ] Solution follows repository conventions
- [ ] Naming is clear and consistent
- [ ] Logic is modularized
- [ ] Edge cases were considered
- [ ] No unnecessary complexity
- [ ] Commits are signed
- [ ] Commit messages follow Conventional Commits

---

# Coding Expectations

Students are encouraged to:

- Prefer readability over cleverness
- Avoid premature optimization
- Write defensive code
- Validate user input
- Refactor duplicated logic
- Use meaningful naming

---

# AI Usage Policy

AI tools may be used for:

- Explanations
- Debugging assistance
- Learning concepts
- Refactoring suggestions

AI tools should NOT be used to:

- Generate full solutions without understanding them
- Submit code the student cannot explain
- Bypass the learning process

Students must fully understand and be able to explain submitted solutions.

---

# Review Philosophy

Reviews are intended to help contributors improve:

- problem solving
- code quality
- software design
- engineering thinking

Feedback should be constructive and educational.

---

# Recommended Java Version

text Java 17+ 

---

# Final Goal

The objective of this repository is not only to complete exercises.

The objective is to progressively learn how to:

- build maintainable software
- collaborate professionally
- structure applications correctly
- think like a software engineer