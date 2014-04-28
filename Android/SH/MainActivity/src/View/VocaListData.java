package View;

public class VocaListData {
	private String Title;
	private int WordCnt;
	private int ExamCnt;
	private int LinkCnt;
	
	public VocaListData(String Title, int WordCnt, int ExamCnt,
			int LinkCnt) {
		this.setTitle(Title);
		this.setWordCnt(WordCnt);
		this.setExamCnt(ExamCnt);
		this.setLinkCnt(LinkCnt);

	}

	// ����Ʈ �信 �ܾ��� ���� �߰� �ϴ� �κ� 
	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	// ����Ʈ �信 �ܾ� �� �߰� �ϴ� �κ�
	public int getWordCnt() {
		return WordCnt;
	}

	public void setWordCnt(int WordCnt) {
		this.WordCnt = WordCnt;
	}

	// ����Ʈ �信 ���� �� �߰� �ϴ� �κ�
	public int getExamCnt() {
		return ExamCnt;
	}

	public void setExamCnt(int ExamCnt) {
		this.ExamCnt = ExamCnt;
	}

	// ����Ʈ �信 ��ũ �� �߰� �ϴ� �κ�
	public int getLinkCnt() {
		return LinkCnt;
	}

	public void setLinkCnt(int LinkCnt) {
		this.LinkCnt = LinkCnt;
	}
}
