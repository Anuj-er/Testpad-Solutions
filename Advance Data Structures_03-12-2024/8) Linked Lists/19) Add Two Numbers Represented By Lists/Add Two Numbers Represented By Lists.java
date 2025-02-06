class Result {
    static Node addListNumbers(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node temp1 = head1, temp2 = head2, current = dummy;
        int carry = 0;
        while (temp1 != null || temp2 != null || carry != 0) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
}