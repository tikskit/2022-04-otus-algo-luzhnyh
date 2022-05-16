package ru.tikskit.lesson02;

public class LuckyTicketCounterRecursion implements LuckyTicketCounter {
    @Override
    public long calc(int n) {
        return calcLeft(n, 0, 0);
    }


    /**
     *
     * @param maxDigitsCount максимальное количество цифр с каждой стороны
     * @param curDigitInd индекс текущей цифры [0..maxDigitsCount - 1]
     * @param leftCurSum сумма цифр слева для curDigitInd-1 цифр
     * @return количество счастливых билетов
     */
    private long calcLeft(int maxDigitsCount, int curDigitInd, int leftCurSum) {
        if (curDigitInd < maxDigitsCount) {
            long res = 0;
            for (int n = 0; n <= 9; n++) {
                res += calcLeft(maxDigitsCount, curDigitInd + 1, leftCurSum + n);
            }
            return res;
        } else {
            return calcRight(maxDigitsCount, 0, leftCurSum, 0);
        }
    }

    /**
     * Рекурсивно считает сумму справа
     * @param maxDigitsCount максимальное количество цифр с каждой стороны
     * @param curDigitInd индекс текущей цифры [0..maxDigitsCount - 1]
     * @param leftSum сумма слева, на равенство которой проверяется сумма справа
     * @param rightCurSum сумма справа для curDigitInd-1 цифр
     * @return количество счастливых билетов
     */
    private long calcRight(int maxDigitsCount, int curDigitInd, int leftSum, int rightCurSum) {
        if (curDigitInd < maxDigitsCount - 1) {
            long res = 0;
            for (int n = 0; n <= 9; n++) {
                res += calcRight(maxDigitsCount, curDigitInd + 1, leftSum, rightCurSum + n);
            }
            return res;
        } else {
            int n = leftSum - rightCurSum;
            if (n >= 0 && n <= 9) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
