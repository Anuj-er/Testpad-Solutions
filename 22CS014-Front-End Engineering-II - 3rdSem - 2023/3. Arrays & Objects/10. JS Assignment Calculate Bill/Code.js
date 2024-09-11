function calculateBill(bill) {
    let totalBillAmount = 0;
    let billItems = [];
    bill.billItems.forEach(billItem => {
      const menuItem = menu.find(item => item.id === billItem.id);
      // Calculate the discounted price
      let discountedPrice = menuItem.rate;
      if (billItem.discount.isInPercent) {
        discountedPrice -= (menuItem.rate * billItem.discount.rate / 100);
      } else {
        discountedPrice -= billItem.discount.rate;
      }
      // Calculate the total price with taxes
      let totalPrice = discountedPrice;
      menuItem.taxes.forEach(tax => {
        if (tax.isInPercent) {
          totalPrice += (discountedPrice * tax.rate / 100);
        } else {
          totalPrice += tax.rate;
        }
      });
      // Calculate the total item amount
      const totalItemAmount = totalPrice * billItem.quantity;
      // Update total bill amount
      totalBillAmount += totalItemAmount;
      // Format the bill item info
      const billItemInfo = `${menuItem.itemName}@${menuItem.rate} x ${billItem.quantity} = ${totalItemAmount.toFixed(2)}`;
      billItems.push(billItemInfo);
    });
    // Round off total bill amount to 2 decimal places
    totalBillAmount = totalBillAmount.toFixed(2);
    return [totalBillAmount, billItems];
  }