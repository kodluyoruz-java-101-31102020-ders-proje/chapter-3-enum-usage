package chapter3.enums.goodcode;

public enum PaymentStatus {

	SUCCESS("200", "İşlem başarıyla sonuçlandırıldı."),
	PROVISION("202", "İşlem askıda beklemektedir."),
	FAIL("500", "İşlem başarısız oldu.");
	
	private String code;
	private String description;
	
	
	private PaymentStatus(String code, String description) {
		
		this.code = code;
		this.description = description;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String fullDescription() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("İşlem kodu: ");
		builder.append(this.code);
		builder.append(" ");
		builder.append("Açıklama: ");
		builder.append(this.description);
		
		return builder.toString();
	}
}
