package Chapter5.Card;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();	//�̱��� ����
		
		Card myCard = company.createCard();		//�޼��忡�� Card ����
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());		//10001 ���
		System.out.println(yourCard.getCardNumber());		//10002 ���
		
	}

}