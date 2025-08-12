package model;

import java.sql.Array;
import java.util.*;

public class Guerriers extends Personnages {

    private int force;
    public Guerriers(String nom, String race, String classe, String groupe, int pointsDeVie, int setForce) {
        super(nom, race, classe, groupe, pointsDeVie);
        this.setForce (setForce);

    }

    private static List<String> guerriers = new ArrayList<String>() {
        public void add(int index, Guerriers element) {
            guerriers.add(0, "Gontran");
            guerriers.add(1, "Georgina");
            guerriers.add(2,"Gaetan");
            guerriers.add(3,"Ginette");
        }

    };

    public int getForce () {
        return force;
    }
    public void setForce (int force) {
        this.force = force;
    }


        /*@Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Guerriers> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Guerriers guerriers) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Guerriers> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Guerriers> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Guerriers get(int index) {
            return null;
        }

        @Override
        public Guerriers set(int index, Guerriers element) {
            return null;
        }

        @Override
        public void add(int index, Guerriers element) {

        }

        @Override
        public Guerriers remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Guerriers> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Guerriers> listIterator(int index) {
            return null;
        }

        @Override
        public List<Guerriers> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    }*/
}
