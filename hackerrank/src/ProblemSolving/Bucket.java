package ProblemSolving;

import java.util.Scanner;

/**
 * With just a 3L bucket and 5L bucket, and an infinite amount of water, how can you end up with 4L in the 5L bucket.
 * To measure exactly 4L of water using just a 3L bucket and a 5L bucket, follow these steps:

 * Fill the 3L bucket completely.
 * Pour the water from the 3L bucket into the 5L bucket.
 * Fill the 3L bucket again.
 * Carefully pour the water from the 3L bucket into the 5L bucket until the 5L bucket is full.
 * Since the 5L bucket was already holding 3L of water, you will only be able to pour an additional 2L from the 3L bucket into it.
 * At this point, there is 1L of water remaining in the 3L bucket.
 * Empty the 5L bucket completely.
 * Pour the 1L of water from the 3L bucket into the now-empty 5L bucket.
 * Fill the 3L bucket completely again.
 * Pour the water from the 3L bucket into the 5L bucket, which already contains 1L of water.
 * The 5L bucket will now have exactly 4L of water (1L from step 8 + 3L from step 10).
 */

public class Bucket {
    private final int capacity;

    private int currentVolume;
    private static final int EMPTY = 0;

    public Bucket(int capacity) {
        this.capacity = capacity;
        this.currentVolume = EMPTY;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void fill() {
        currentVolume = getCapacity();
    }

    public void empty() {
        currentVolume = EMPTY;
    }

    public void pour(Bucket targetBucket) {
        int availableSpace = targetBucket.getCapacity() - targetBucket.getCurrentVolume(); //available space in the target bucket

        //the available space in the target bucket and the current volume of the source bucket
        int transferVolume = Math.min(availableSpace, this.currentVolume);

        targetBucket.currentVolume += transferVolume; //current volume in the target bucket
        this.currentVolume -= transferVolume; //current volume in the source bucket
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the buckets: ");

        int firstBucketIntValue = scanner.nextInt();
        int secondBucketIntValue = scanner.nextInt();
        Bucket firstBucket = new Bucket(firstBucketIntValue); //3l
        Bucket secondBucket = new Bucket(secondBucketIntValue); //5l

        firstBucket.fill(); //Fill 3L bucket
        firstBucket.pour(secondBucket); // Pour 3L bucket int 5L bucket
        firstBucket.fill(); //Fill 3L bucket
        firstBucket.pour(secondBucket); // Pour 3L bucket int 5L bucket to make it full, we'll have 1L left in the 3L bucket assuming no overflow wastage
        secondBucket.empty(); //Empty the 5L bucket
        firstBucket.pour(secondBucket); //Pour 1L remaining in the 3L bucket into the empty 5L bucket
        firstBucket.fill(); //Fill the 3L bucket again
        firstBucket.pour(secondBucket); //Pour the 3L bucket into the 5L bucket

        if (secondBucket.getCurrentVolume() > 1) {
            System.out.println("Final volume in the 5 litre bucket is " + secondBucket.getCurrentVolume() + " litres");
        } else {
            System.out.println("Final volume in the 5 litre bucket is " + secondBucket.getCurrentVolume() + "litre");
        }
    }
}
