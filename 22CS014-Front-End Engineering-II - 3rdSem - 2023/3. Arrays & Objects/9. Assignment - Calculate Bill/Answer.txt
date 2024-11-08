function calculateBill(bill) {
  let totalBillAmount = 0;
  let billItems = [];

  // Iterate through each item in the bill
  bill.billItems.forEach(billItem => {
    // Find the corresponding menu item for this bill item by matching the id
    const menuItem = menu.find(item => item.id === billItem.id);

    if (menuItem) {
      let basePrice = Math.round(menuItem.rate); // Round base price to the nearest whole number
      const quantity = billItem.quantity;
      const discount = billItem.discount;

      // Record the base price (before applying any discount) as a whole number
      const basePriceBeforeDiscount = basePrice;

      // Apply discount
      let discountedPrice;
      if (discount.isInPercent) {
        // Percentage-based discount
        discountedPrice = basePrice - (basePrice * (discount.rate / 100));
      } else {
        // Fixed-rate discount
        discountedPrice = basePrice - discount.rate;
      }

      // Apply taxes on the discounted price
      let finalPricePerItem = discountedPrice;
      menuItem.taxes.forEach(tax => {
        if (tax.isInPercent) {
          // Percentage-based tax
          finalPricePerItem += discountedPrice * (tax.rate / 100);
        } else {
          // Fixed-rate tax
          finalPricePerItem += tax.rate;
        }
      });

      // Round the final price per item to 2 decimal places after applying discounts and taxes
      finalPricePerItem = parseFloat(finalPricePerItem.toFixed(2));

      // Calculate the total for this item by multiplying by the quantity
      const itemTotal = parseFloat((finalPricePerItem * quantity).toFixed(2));

      // Add the item total to the overall bill amount
      totalBillAmount += itemTotal;

      // Format the bill item info with base price before discount and whole numbers for base price
      const itemInfo = `${menuItem.itemName}@${basePriceBeforeDiscount} x ${quantity} = ${itemTotal.toFixed(2)}`;
      billItems.push(itemInfo);
    }
  });

  // Round the final total bill amount to 2 decimal places
  totalBillAmount = totalBillAmount.toFixed(2);

  return [totalBillAmount, billItems];
}
