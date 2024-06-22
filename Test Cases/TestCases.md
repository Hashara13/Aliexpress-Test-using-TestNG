# Aliexpress Landing Page

## Prepared By
- **Name**: Hashara Nethmin
- **Designation**: Undergraduate
- **Date**: 22.06.2024

## URL
[Aliexpress Landing Page](https://www.aliexpress.com/?spm=a2g0o.productlist.logo.1.ab1cOi47Oi47nV)

## Test Cases

| TEST CASE ID | TEST CASE DESCRIPTION | PRECONDITION | EXPECTED RESULT | POSTCONDITION | ACTUAL RESULT | STATUS |
|--------------|-----------------------|--------------|-----------------|---------------|---------------|--------|
| TC_001       | Enter a valid search term in the search bar | User need to access Landing Page | should display products related to the search input | Press Enter Button or Search icon | Item lists occurred | Pass |
| TC_002       | Enter an invalid search term or blank in the search bar | User need to access Landing Page | should prompt user with a message indicating "no results found" | Press Enter Button or Search icon | "no results found" message | Pass |
| TC_003       | Select Any product Component | User need to access Landing Page & search an item | Should navigate to product full details view | Click any place in the component | Product details view | Pass |
| TC_004       | Click add to cart button | One product needs to be selected | Appear cart button and Buy button | Window event occurred | Pass |
| TC_005       | Click add to cart button if already in the cart | One product needs to be selected | "Already added" message needs to popup | "Already added" message | Pass |
| TC_006       | Go to cart for checkout | User needs to access in cart section | Show checkout Button | checkout Button | Pass |
| TC_007       | Checkout if user already have signed in | User need to access Landing Page | Land to Purchase screen | Land to Purchase screen | Pass |
| TC_008       | Landing to logging page if user not signed in | User need to access Landing Page | Login Popup occur | Login Popup occur | Pass |
| TC_009       | Enter valid email | User need to access Landing Page | Email successfully entered message | Email successfully entered message | Pass |
| TC_010       | Enter Invalid email | User need to access Landing Page | Email doesn't exist | Email doesn't exist | Pass |
| TC_011       | Press Continue Button | User need to access Landing Page | Land to Purchase screen | Land to Purchase screen | Pass |

## Test Examples

| TEST CASE ID | TEST DATA EXAMPLES |
|--------------|--------------------|
| TC_001       | "smartphone", "laptop", "headphones" |
| TC_002       | "asdfghjkl", "" |
| TC_003       | "smartphone", "laptop" |
| TC_004       | "smartphone" |
| TC_005       | "smartphone" |
| TC_006       | "smartphone", "laptop" |
| TC_007       | "smartphone", "laptop" |
| TC_008       | "smartphone", "laptop" |
| TC_009       | "valid@example.com" |
| TC_010       | "invalid@example.com" |
| TC_011       | "valid@example.com" |
