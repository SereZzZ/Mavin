package org.example.dz2;

public class SqrtService {

    public int calcSqrt(int x) {
        for (int i = 0; i <= x; i++) {
            if(i * i >= x){
                return i;
            }

        }
        return -1;
    }
}
