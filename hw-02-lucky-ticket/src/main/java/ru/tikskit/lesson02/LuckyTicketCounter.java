package ru.tikskit.lesson02;

/**
 * Интерфейс счетчиков количества счастливых билетов
 */
public interface LuckyTicketCounter {
    /**
     * Вычислить количество счастливых билетов для билета из 2*N цифр
     * @param n количество чисел с одной стороны билета
     * @return количество счастливых билетов
     */
    long calc(int n);
}
