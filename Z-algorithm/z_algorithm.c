#include <stdio.h>
#include <string.h>
#include <time.h>


void Z_algorithm(char a[], char b[]){
	int n,r;
	int i=0,cnt,k,j;
	r=strlen(b);   //ilerde kullanmak �zere z dizisini kontrol etmek i�in b stringinin uzunlu�unu r ye atad�m
	strcat(b,"$");  //pattern stringine �zel karakter ekledim
	strcat(b,a);   //pattern� prefix yap�p analiz yap�lacak stringi olu�turmak i�in text ile pattern'� birle�tirdim
	n=strlen(b);
	int z[n];
	z[0]=0;   //z[] dizisinin ilk eleman� her zaman 0'd�r
	for(i=1;i<n;i++){  //z[] dizisini olu�turmak i�in bir for d�ng�s�
		cnt=0; 
		k=i;
		for(j=0;j<n-1;j++,k++){ //ayn� harflere rastlan�ld�ysa counter'� 1 artt�racak, rastlan�lmazsa counter� z dizisine atacak olan for d�ng�s�
			if(b[k]==b[j]){
				cnt++;
				continue;
			}
			else break;
		}
		z[i]=cnt;
	}
	printf("\nStringe bu indexlerde rastlandi : ");
	cnt=0;
	for(i=0;i<n;i++){ //rastlan�lan indexin yerini aramak i�in bir for d�ng�s�

		if(z[i]==r){
		printf("%d ",i-r-1);
		cnt++;
		}
	}
	if(cnt==0) printf("Eslesen hic bir stringe rastlanmadi.\n");
}




void gen_random(char s[], const int len) {  //uzunlu�a g�re rastgele string atayan bir fonksiyon yazd�m
	srand(time(NULL));
    static const char alphanum[] =     "abc"; //daha fazla rastlan�lan index ��kmas� ad�na rastgele string gelme olas�l���n� 'abc' harfleriyle s�n�rlad�m
    int i;
    for (i = 0; i < len; ++i) {
        s[i] = alphanum[rand() % (sizeof(alphanum) - 1)];
    }

    s[len] = 0;
}



int main(){
	int i,j,k,p,n,r,count;
	clock_t before,after; //time.h k�t�phanesinden clock() fonksiyonunu �a��rmak i�in tan�mlad�m
	double time[100]; //diyagram kurarken harcanan s�releri tutumas� i�in bir array
	char a[40],b[20],c[100000], d[100000]; 
	printf("Lutfen ana stringi(text) giriniz:\n");
	scanf("%s",a);
	printf("Lutfen rastlantisini bulmak istediginiz stringi(pattern) giriniz:\n");
	scanf("%s",b);
	
	Z_algorithm(a,b);  //Z algoritmas�n� uygulamak �zere fonksiyonumu �a��rd�m
	
	getch();
	
	//Algoritman�n temel mant��� buraya kadard�, �imdi zaman analizini inceleyelim
	
	printf("\n\n** Simdi , farkli inputlar icin harcanan surelere bakalim **\n");
	count = 0;
	while(count<5){ //5 farkl� input i�in zaman analizi yapacak bir while(for d�ng�s� de yap�labilir) dong�s� a�t�m
		printf("\nLutfen ana stringin(text) uzunlugunu girin:");
		scanf("%d", &k);
		gen_random(c, k); //Girilen uzunlu�a g�re text i�in random bir string atand�
		
		printf("Lutfen rastlantisini bulmak istediginiz stringin(pattern) uzunlugunu girin :");
		scanf("%d", &p);
		gen_random(d, p); //Girilen uzunlu�a g�re pattern i�in random bir string atand� 
		
		before = clock (); //��lemin ba�lang�� zaman�n� tutmak i�in
			
			Z_algorithm(c,d);
	    
		after = clock(); //��lemin biti� zaman�n� tutmak i�in
		double elapsed = (double) (after-before)*1000 / CLOCKS_PER_SEC;  //Saniye de�erlerim s�re olarak �ok k���k say�lar ��kt��� i�in saniyeyi milisaniyeye �evirdim
		time[count] = elapsed;   //Diyagram i�in s�re de�erlerini bir diziye att�m
		printf("\n\nHarcanan Zaman: %lf milisaniye. \n\n", elapsed);     
		count++;	
	}
	printf("***Analizin Diyagrami***\n");
	char show = '#';
	for(i=0; i<5; i++){ //5 farkl� input i�in diyagram yapaca��m i�in 5 kere d�nd�rd�m
		printf("\n");
		printf("%i. aramanin diyagrami: ", i+1);
		for(j=0; j<time[i]; j++){
			printf("%c", show); // diyagram� bast�r�rken '#' i�aretini kulland�m
		}
	}
	
	
	
	
	return 0;
}
