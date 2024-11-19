#include <iostream>
#include <cmath>
using namespace std;

long int factoriel(int n)
{
    if (n == 0)
    {
        return 1;
    }
    int p = 1;
    for (int i = 1; i <= n; i++)
    {
        p *= i;
    }
    return p;
}
double binFaktor(double n, double k)
{
    if (n == k)
    {
        return 1;
    }
    if (k == 0)
    {
        return 1;
    }
    if (k == 1)
    {
        return n;
    }
    int gore = 1;
    int dole = min(k, n - k);
    int tmp = n;
    for (int i = 0; i < dole; i++)
    {
        gore *= tmp--;
    }
    int res = gore / factoriel(dole);
    return res;
}
double prob(int n, int k, double p)
{
    return (binFaktor(n, k) * (pow(p, k) * pow(1 - p, n - k)));
}
int main()
{
    double n;
    double k;
    double p;
    while (true)
    {
        cout << "Vnesi broj na obidi: ";
        cin >> n;
        if (n == 0)
        {
            break;
        }
        // cout << "Vnesi broj na uspeh: ";
        // cin >> k;
        cout << "Vnesi verojatnost za uspeh: ";
        cin >> p;
        cout << "Binomna distribucija za n=" << n << " p=" << p << endl;
        for (int i = 0; i <= n; i++)
        {
            cout << "P(X=" << i << ")=" << prob(n, i, p) << endl;
        }
    }
}