class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int recordSum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int currTop = record.pop();
                int prevTop = record.peek();
                record.push(currTop);
                record.push(currTop + prevTop);
            } else if (operations[i].equals("D")) {
                int currTop = record.peek();
                record.push(currTop * 2);
            } else if (operations[i].equals("C")) {
                record.pop();
            } else {
                record.push(Integer.parseInt(operations[i]));
            }
        }
        for (int i = 0; i < record.size(); i++) {
            recordSum += record.get(i);
        }
        return recordSum;
    }
}