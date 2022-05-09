package ru.tikskit.lesson01;

public class App {
    public static void main(String[] args) {
        Spell spell;
        spell = new SpellNo10();
        spell.cast();

        System.out.println();

        spell = new SpellNo12();
        spell.cast();

        System.out.println();

        spell = new SpellNo20();
        spell.cast();
    }
}
