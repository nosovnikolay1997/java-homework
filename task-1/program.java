import java.util.Random;

public class Program {
	public static void main(String[] args) {
		short i = getRandomNumber();
		short n = getBitIndex(i);
		short[] m1 = getMultiples(i, n);
		short[] m2 = getNonMultiples(i, n);
	}

	static short[] getNonMultiples(short e, short d) {
		int count = 0;
		for (short i = Short.MIN_VALUE; i < e; ++i)
			if (i % d != 0)
				++count;
		short[] nonMultiples = new short[count];
		count = 0;
		for (short i = Short.MIN_VALUE; i < e; ++i)
			if (i % d != 0)
				nonMultiples[count++] = i;
		return nonMultiples;
	}

	static short[] getMultiples(short s, short d) {
		int count = 0;
		for (short i = s; i < Short.MAX_VALUE; ++i)
			if (i % d == 0)
				++count;
		short[] multiples = new short[count];
		count = 0;
		for (short i = s; i < Short.MAX_VALUE; ++i)
			if (i % d == 0)
				multiples[count++] = i;
		return multiples;
	}

	static short getRandomNumber() {
		return (short)(new Random().nextInt(2001));
	}

	static short getBitIndex(short k) {
		short res = 1;
		short cur = 1;
		while (k > 0) {
			if ((k & 1) == 1)
				res = cur;
			++cur;
			k = (short)(k >> 1);
		}
		return res;
	}
}
