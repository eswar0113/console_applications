# Super Market Billing System - Pending Requirements (No Logic Change)

This note captures the remaining requirements from the problem statement while preserving the current implementation logic.

## Module A - Authentication and Welcome Menu
Current status: Partially done.

Pending:
- Support both roles explicitly: Admin and Customer.
- Authenticate using Email ID + Password (not just name-style username).
- Show role-based welcome menu after successful login.
- Keep Sign Up / Sign In option mapping consistent with prompt text.

## Module B - Inventory Management (Admin)
Pending:
- Add item.
- Modify item details and quantity.
- Delete item.
- Add other Admins and Customers.
- View products sorted by Name.
- View products sorted by Price.
- Search product by product name.
- Increase customer credit.

## Module C - Customer Purchase
Pending:
- View all products.
- Select product by Product ID.
- Enter quantity and add to cart.
- Add more items and add same item again.
- Edit cart quantity.
- Delete item from cart.
- Proceed to payment.

## Module D - Payment Rules
Pending:
- Each customer starts with Rs 1000 preloaded credit at signup.
- Allow purchase only within available credit.
- Reward Rule A: if bill amount >= Rs 5000, add Rs 100 cashback to wallet and no points.
- Reward Rule B: 1 loyalty point per Rs 100 spent.
- On reaching 50 points, give Rs 100 discount on next immediate bill.

## Module E - Purchase History
Pending:
- Customer can view all previous purchases.
- Display by bill date and bill number.

## Module F - Reports (Admin)
Pending:
- Products with low quantity for refill.
- Products not bought by any customer.
- Customers who bought for higher total value.
- Admins who made higher sales.

## Suggested Next Increment (Without Full Refactor)
1. Finish Module A first with role + email/password + role menu.
2. Add in-memory collections for products, users, cart, and bills.
3. Add Module B and C operations.
4. Add Module D payment and rewards.
5. Add Module E history and Module F reports.
