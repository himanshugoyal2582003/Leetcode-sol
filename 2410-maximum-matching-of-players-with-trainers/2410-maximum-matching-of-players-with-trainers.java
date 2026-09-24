class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Thread t1 = new Thread(() -> Arrays.sort(players));
        Thread t2 = new Thread(() -> Arrays.sort(trainers));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        int j = 0, count = 0;
        for (int i = 0; i < players.length; i++) {
            while (j < trainers.length) {
                if (players[i] <= trainers[j]) {
                    count++;
                    ++j;
                    break;
                }
                ++j;
            }
        }
        return count;
    }
}