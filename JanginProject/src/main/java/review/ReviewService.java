package review;

import java.util.List;

import manage.ManageVO;



public interface ReviewService {

	public List<ReviewVO> reviewlist();

	public List<ReviewVO> myreviewlist(int vid);

	public List<ReviewVO> getreviewdetail(int rid);

	//Ŭ���� ��ȸ�� 1����
	public void updateViewcount(int rid);

	//���� �ۼ��ϱ�
	public int reviewWrite(ReviewVO vo);

	//���� ����
	public void reviewUpdate(ReviewVO vo);

	//���� ����
	public void reviewDelete(int mid);

	//���丷��
	public int reviewDupCheck(ManageVO vo);

}
