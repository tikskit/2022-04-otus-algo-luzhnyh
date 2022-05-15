package ru.tikskit.lesson02;

/**
 * Реализация счетчика на уровне Junior для 3 цифр с каждой стороны
 */
public class LuckyTicketCounterJuniorN3 implements LuckyTicketCounter {
    /**
     *
     * @param n количество чисел с одной стороны билета. В данной реализации игнорируется
     * @return
     */
    @Override
    public long calc(int n) {
        long res = 0;

        for (int l1 = 0; l1 <= 9; l1++) {
            for (int l2 = 0; l2 <= 9; l2++) {
                for (int l3 = 0; l3 <= 9; l3++) {
                    int leftSumm = l1 + l2 + l3;

                    for (int r1 = 0; r1 <= 9; r1++) {
                        for (int r2 = 0; r2 <= 9; r2++) {
                            int r3 = leftSumm - (r1 + r2);
                            if ((r3 >= 0) && (r3 <= 9)) {
                                res++;
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}
