package com.nacs.logicalprograms;

public class PatternPrinting {
	int row;

	public PatternPrinting() {

	}

	public PatternPrinting(int row) {
		this.row = row;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;

	}

	public void printHollow() {
		for (int row = 1; row <= this.row; row++) {
			for (int col = 1; col <= this.row; col++) {
				if (row == 1 || row == this.row || col == 1 || col == this.row)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
	}

	public void printSquare() {
		for (int row = 1; row <= this.row; row++) {
			for (int col = 1; col <= this.row; col++) {

				System.out.print(" * ");
			}
			System.out.println();

		}
	}

	public void printSquareWithRowWiseLettersAndDigits() {
		char ch = 'A';
		for (int row = 1; row <= this.row; row++) {
			for (int col = 1; col <= this.row; col++) {
				if (row % 2 == 0)
					System.out.print(" 1 ");
				else
					System.out.print(" A ");
//						
				System.out.print(" ");
			}
			System.out.println(" " + (ch++) + " ");
		}
		System.out.println();
	}

	public void printSquareWithContinuousLettersAndDigits() {
		char ch = 'A';
		int charVar = 'Z';
		for (int row = 1; row <= this.row; row++) {
			for (int col = 1; col <= this.row; col++) {
				if (row % 2 == 0)
					System.out.print(" " + 1 + " ");
				else
					System.out.print(" " + (ch++) + " ");
				// System.out.print(" "+(charVar++)+" ");
//			
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("\t");

	}

	public void printAlternatingRowLetterDigitSquare() {
		char ch = 'A';
		int charVar = 'Z';
		int number = 0;
		for (int row = 1; row <= this.row; row++) {
			for (int col = 1; col <= this.row; col++) {
				if (row % 2 == 0) {
					System.out.print(" " + (number++) + " ");
				} else {
					if (ch <= 'Z')
						System.out.print(" " + (ch++) + " ");
					else {
						System.out.print(" " + 'A' + " ");
						ch = 'B';
					}
				}
				// System.out.print(" "+(charVar++)+" ");
//			

			}
			System.out.println();
		}

	}

	public void printCheckerboardLetterDigitSquare() {
		int rowCount = this.row;
		char ch = 'A';
		int number = 0;

		for (int row = 1; row <= rowCount; row++) {
			for (int col = 1; col <= rowCount; col++) {
				if (row % 2 == 0) {
					System.out.print(" " + (number % 10) + " ");
					number++;
				} else {
					if (ch <= 'Z') {
						System.out.print(" " + ch + " ");
						ch++;
					} else {
						ch = 'A';
						System.out.print(" " + ch + " ");
						ch++;
					}
				}
			}
			System.out.println();
		}
	}

	public void printAlternatingLetterDigitSquarePattern() {
		char ch = 'A';
		int number = 0;

		for (int row = 1; row <= this.row; row++) {
			for (int col = 1; col <= this.row; col++) {
				if ((row + col) % 2 == 0) { // Even cell: Alphabet
					System.out.print(" " + ch + " ");
					ch++;
					if (ch > 'Z') {
						ch = 'A';
					}
				} else { // Odd cell: Digit
					System.out.print(" " + number + " ");
					number++;
					if (number > 9) {
						number = 0;
					}
				}
			}
			System.out.println();
		}
	}

	public void printInvertedRightAngleTriangle() {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void UpSideDownleftAlignedInvertedTriangle() {

		for (int row = 10; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printRightAlignedTriangleWithSpacing() {

		for (int row = 1; row <= this.row; row++) {
			for (int space = this.row; space >= row; space--)
				System.out.print(" ");
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printPyramidPatternTriangle() {

		for (int row = 1; row <= this.row; row++) {
			for (int space = row; space < this.row; space++)
				System.out.print(" ");
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void PyramidPatternTriangle() {

		for (int row = 1; row <= this.row; row++) {
			for (int space = row; space < this.row; space++)
				System.out.print(" ");
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void printUpSideDownTriangle() {

		for (int row = 1; row <= this.row; row++) {
			for (int space = 1; space < row; space++)
				System.out.print(" ");
			for (int col = row; col <= this.row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void NumberAndLetterTriangleWithoutSpacePyramidPattern() {
		char ch = 'a';
		int number = 0;
		for (int row = 1; row <= this.row; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}
			for (int col = row; col <= this.row; col++) {
				if (row % 2 == 0) {
					System.out.print((ch++) + " ");
				} else {
					System.out.print((number++) + " ");
				}
			}
			System.out.println();
		}
	}

	public void printRightAlignedNumberAndLetterTriangleWithOutSpace() {
		char ch = 'a';
		int number = 0;
		for (int row = 1; row <= this.row; row++) {
			for (int space = row; space < this.row; space++)
				System.out.print(" ");
			for (int col = 1; col <= row; col++) {
				if (row % 2 == 0) {
					System.out.print((ch++) + " ");
				} else {
					System.out.print((number++) + " ");
				}
			}
			System.out.println();
		}
	}

	public void printCenteredNumberAndLetterTriangleWithSpace() {
		char ch = 'a';
		int number = 0;
		for (int row = 1; row <= this.row; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col <= this.row; col++) {
				if (row % 2 == 0) {
					System.out.print((ch++) + "   ");
				} else {
					if (number <= 9) {
						System.out.print((number++) + "   ");
					} else {
						System.out.print(0 + "   ");
						number = 1;
					}

				}
			}
			System.out.println();

		}
	}

	public void printCenteredMixedTriangleWithPattern() {
		char ch = 'a';
		int number = 0;
		for (int row = 1; row <= this.row; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col <= this.row; col++) {
				if (row % 2 == 0) {
					if (col % 2 != 0) {
						if (number <= 9) {
							System.out.print((number++) + "   ");
						} else {
							System.out.print(0 + "   ");
							number = 1;
						}

					} else {
						if (ch <= 'z') {
							System.out.print((ch++) + "   ");
						} else {
							System.out.print(0 + "   ");
							ch = 'b';
						}

					}

					// System.out.print((ch++) + " ");
				} else {
					if (col % 2 == 0) {
						if (ch <= 'z') {
							System.out.print((ch++) + "   ");
						} else {
							System.out.print(0 + "   ");
							ch = 'b';
						}
					} else {
						if (number <= 9) {
							System.out.print((number++) + "   ");
						} else {
							System.out.print(0 + "   ");
							number = 1;
						}
					}
				}
			}
			System.out.println();

		}
	}

	public void printSquareWithAlphabetsAndDigits() {
		// TODO Auto-generated method stub
		
	}
}

