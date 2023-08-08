package Array;
public class findduplicatenumber{
    public int findduplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];

            System.out.print(slow+""+fast+" ");
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
    }
}

/*
Tortise an Hare
1st loop:
slow=1
fast=3

slow=3
fast=4

slow=2
fast=4

slow=4
fast=4

2nd loop:

slow=1
fast=2

slow=3
fast=4

slow=2
fast=2

 */ 