package uren.com.ilgincbilgiler.ContentClasses;

public class Religion {

    String[] RELIGION_INFO = new String[]{
            "Vücutlarına Şiş Geçiren Kızılderililer\n" +
                    "Kabilenin erkekleri 8 gün boyunca vücutlarına geçirdikleri şişlerle dolaşıyorlar ve bunun adına güneş dansı diyorlar.",
            "Hindu Piercing Ritüeli\n" +
                    "Güney Hindistanlılar vücutlarına büyük piercingler takıp piercinglerinden çekiştiriliyorlar, üstelik buna dilleri de dahil. Bunu Tanrı Murugan’ın mızraklı düşmanını alt etmesi olarak nitelendiriyorlar.",
            "Matasu Erkekliğe Geçiş Ayini\n" +
                    "Evlilik yaşına gelmiş olan erkeklerin boğaz, dil ve burunlarına sopalar sokmak Papua Yeni Gine'deki dini bir ritüel...",
            "Çarmıha Germe\n" +
                    "Flipinli Hristiyanların \"Güzel Cuma\" adını verdikleri törende kadınlar ve erkekler çarmıha gerilerek peygamberlerinin çektikleri acıyı yaşamak istiyor.",
            "Zehirli Karınca Ayini\n" +
                    "Brezilya'daki erkekler içlerinde zehirli karıncılar bulunan eldivenleri giyip yüzlerinde hiçbir acı verici ifade olmadan 20 dakika durmak zorunda...",
            "Kendilerini Mumyalayan Budistler\n" +
                    "En ilginci de bu... Hem uzun hem acılı... Rahipler kendi kendilerini mumyaya çeviriyorlar. Ayinin adı Sokushinbutsu. 3 yıl boyunca sadece tohum ve fındık yiyorlar. Vücutları zayıflıyor, yağdan kurtuluyorlar. Sonra, 3 yıl boyunca ağaç dalları yeyip zehirli bir çay içiyorlar. Tam ölmek üzereyken canlı canlı mezara gömülüyorlar.",
            "Jainism ;\n" +
                    "\n" +
                    "Jainisim, 2.500 yıllık tarihi olan dünyanın en eski dinlerindendir. Hindistan’da yayılmıştır. Tanrıların, karmaşık bir hiyerarşi içinde insanlarla birlikte yaşadığına inan bu inançta, insanın kendini kontrol etmesi gerekir. Bedensel tutkular ve zevkler için kendinize savaş açarsınız. Onlara göre, zamanın başı ve sonu yoktur. Oruç, meditasyon ve çile çekerek arınma çok önemli ritüelleridir. Dünyada yaklaşık 5 milyon kişi bu dine mensuptur.",
            "Mandaeism ;\n" +
                    "\n" +
                    "Mandaeism, aydınlanma, kurtuluş ve Tanrı görüşünü benimseyen gnostik bir dindir. Bu dinin İslam dini öncesi kökenli olduğuna inanılır. Yaklaşık 70 bin Mandaeisim inananın İran’a kaçtığı ve oraya yerleştiği bilinir. Herhangi bir kitapları yoktur. İsa, Yahya, İbrahim, Musa peygamberlerin sahte olduğuna inanırlar. Bir Kozmik anne ve baba, ışık, karanlık, yüce varlık gibi inanışları vardır. Büyük gizlilik içinde dinlerini sürdürmektedirler.",
            "Candomble ;\n" +
                    "\n" +
                    "19. yüzyılın başında ortaya çıkan Afro- Brezilya dinidir. Köleleştirilmiş Afrika’lılar tarafından ortaya çıkmıştır. Orishas isimi verilen bir tanrı her insan için bir tane vardır ve onu korur. Bu dinde iyi ve kötü yoktur. Her insan, sonuna kadar kendi kaderini yerine getirmek için çalışır. Yaptığınız herhangi bir kötülük mutlaka size dönecektir. Yaklaşık 2 milyon kişi bu dine inanmaktadır.",
            "Aetherius ;\n" +
                    "\n" +
                    "Aetherius, yeni çağın Ufo dinidir. George King tarafından 1950 ‘li yıllarda kurulmuştur. Daha sonraları, Hinduizm, Budizim, Hıristiyanlık ve Ufo iddiaları ile birleşmiştir. Dünya dışı bir Kozmik efendiye inanılır. Dinin amacı, insanları bu dünya dışı varlıklara işbirliği yapacak düzeye getirmektir. Mesihin bir uçan daire ile dünyaya geleceğine inanılır. Dünya çapında milyonlarca insan bu dine inanmaktadır.",
            "Hermetizm ;\n" +
                    "\n" +
                    "Hermetizm, Rönesans ve reformasyon sırasında Batı ezoterik geleneğinden etkilenen bir inanç sistemidir. Simya, astroloji bu dinde sıklıkla kullanılan öğelerdir. 1300-1600 yılları arasında bilimin gelişmesi ile ortaya çıktığına inanılır. Hermesçiler, kötü iblisler, ilahi melekler, kara büyü ve ilahi büyüye inanırlar.",
            "Zerdüşlük ;\n" +
                    "\n" +
                    "Eski İran kökenli din ve felsefe, tek tanrılı bir dindir. Eski zamanlarda pek çok imparatorluğun dini olmuştur. 145 milyon Zerdüşt bugün dünyamızda vardır. Yahudilik, Hıristiyanlık, İslamiyet gibi dinlerden çok etkilenmiştir. İyi ve kötü birbiri ile mücadele etmektedir. Din, aile ve yaşlılar, saygı konularında çok öğretiye sahiptir.",
            "Thelema ;\n" +
                    "\n" +
                    "20. yüzyılda yazar Alesiter Crowley tarafından geliştirilmiştir. O ve eşi 1904 yılında Mısır’da Aiwass isimli bir varlıkla temasa geçtiğini iddia etmiştir. Onun ona bir kitap verdiğini söyler. Kitapta eski Mısır Tanrılarının adı sıklıkla geçmektedir. Yoga, mistisizm ve Kabala fikirleri vardır.",
            "Maradonna Kilisesi ; Arjantin’de Rosario kentinde kurulan ve Arjantinli efsanevi futbolcu Diego Armando Maradonna’ya tapan bir topluluktur. Kendilerine Diegorian ismini veren bu topluluk, yıl başını Maradonna’nın doğduğu gün olarak alıyorlar. Bu dinin kutsal kitabı Maradonna’nın hayatını anlattığı biyografidir. Maradonna’yı futbol oynadığı dönemde çalıştıran kişilerse havariler olarak kabul ediliyor. Yaklaşık 500 kişilik bir cemaat olan bu topluluk hızla Arjantin’de çoğalıyor.",
            "Nuwanbianism ; New York’ta yaşayan siyah müslümanlar tarafından kurulmuştur. Bu dinin başındaki kişi tecavüz suçundan hapis yatmaktadır. Dinin inanışına göre insanların dengesi düşen bir meteor sayesinde bozulmuştur. Düşük yapan kadınların bebekleri dünyaya tekrar gelecek ve birleşecektir. Ölen kişiyi yakmak lazımdır, çünkü böylece tekrar dünyaya gelemeyecektir. Erkek olarak dünyaya gelebilmek için sayısız kadın olarak dünyaya gelmek gerekmektedir. Dünya üzerinde insan ırkından başka 7 ırk daha yaşamaktadır.",
            "Oneida inancı ; New York’da kurulmuş olan bu cemaat, önceleri Hiristiyan inancı ile başlamıştır. Zaman içinde bu inanca değişik kurallar koymuştur. Buna göre Oneida inacında olan topluluk birbiri ile evlidir. Yaşlı olanlar gençler ile birlikte olarak onları cinselliğe alıştırırlar. Cinsellik çocuk yapmak dışında yasaktır. Ağır eleştiriler yaparak birbirlerini sınarlar, bozulan ve değişen olursa topluluktan atılır.",
            "Yahvey inancı ; Gerçek yahudiler siyah renklidir ve beyazlar şeytandır. Irkçı bir felsefeye sahip olan din, hiristiyanlığıda kabul etmektedir. Bir nevi museviliğin evrim geçirmiş bir hali olarak kendilerini kabul ederler.",
            "Scientology hareketi ; Dünyada en fazla rağbet gören ve mal varlığı en yüksek olan din hareketi olarak kabul edilir. Pek çok ünlü aktör ve aktirist, şarkıcı bu gruba katılmış ve bu inancı kabul etmektedir. Dine göre, bundan 75 yıl önce bir galaktik yönetici istemediği binlerce kişiyi dünyaya göndermiş ve yanardağda yakmıştır. Dünyada insanların acı çekmesinin sebebi bu kişilerin ruhlarıdır. Bu uzaylı ruhları serbest bırakmak için dualar edilmelidir. Ruhlar kurtulunca manevi huzur gelecektir.",
            "Yaohnanen inancı ; Güney Pasifikte küçük bir ada olan Tanna adasındaki yerliler, Kraliçe 2. Elisabeth’in eşi prens Philip’i tanrıları kabul etmektedir. 1974 yılında prensin bir gezisi sırasında orada olan Tanna kabilesinin liderlerinin elini sıkması ile başlayan bu din, her sabah ve akşam yapılan tapınmalar ile halen devam etmektedir."
    };

    public Religion(){

    }

    public String[] getRELIGION_INFO() {
        return RELIGION_INFO;
    }
}
