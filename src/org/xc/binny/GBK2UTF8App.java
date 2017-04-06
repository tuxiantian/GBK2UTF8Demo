package org.xc.binny;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class GBK2UTF8App {

	/**
	 * ���ƶ�Ŀ¼�µ�����JavaԴ�ļ��ı����ʽ��GBK�޸�ΪUTF-8
	 */
	public static void main(String[] args) throws Exception {
		//GBK�����ʽԴ��·��
		String srcDirPath = "E:\\eclipse\\mongodb\\src";
		//תΪUTF-8�����ʽԴ��·��
		String utf8DirPath = srcDirPath;
		
		//��ȡ����java�ļ�
		Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath),null, true);
		
		for (File javaGbkFile : javaGbkFileCol) {
			//UTF8��ʽ�ļ�·��
			String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length());
			//ʹ��GBK��ȡ���ݣ�Ȼ����UTF-8д������
			FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));		
		}

	}

}
